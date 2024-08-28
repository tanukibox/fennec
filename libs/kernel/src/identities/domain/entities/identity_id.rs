use std::hash::{Hash, Hasher};

#[derive(Debug)]
pub struct IdentityId {
    value: String,
}

impl IdentityId {
    pub fn new(id: String) -> IdentityId {
        Self { value: id }
    }

    pub fn value(&self) -> String {
        self.value.clone()
    }
}

impl PartialEq for IdentityId {
    fn eq(&self, other: &Self) -> bool {
        self.value() == other.value()
    }
}

impl Hash for IdentityId {
    fn hash<H: Hasher>(&self, state: &mut H) {
        self.value.hash(state);
    }
}

impl Eq for IdentityId {}

impl Clone for IdentityId {
    fn clone(&self) -> Self {
        Self::new(self.value.clone())
    }
}
