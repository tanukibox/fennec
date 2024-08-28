use std::hash::{Hash, Hasher};

#[derive(Debug)]
pub struct IdentityName {
    value: String,
}

impl IdentityName {
    pub fn new(id: String) -> IdentityName {
        Self { value: id }
    }

    pub fn value(&self) -> String {
        self.value.clone()
    }
}

impl PartialEq for IdentityName {
    fn eq(&self, other: &Self) -> bool {
        self.value() == other.value()
    }
}

impl Hash for IdentityName {
    fn hash<H: Hasher>(&self, state: &mut H) {
        self.value.hash(state);
    }
}

impl Eq for IdentityName {}

impl Clone for IdentityName {
    fn clone(&self) -> Self {
        Self::new(self.value.clone())
    }
}
