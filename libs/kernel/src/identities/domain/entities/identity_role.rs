use std::hash::{Hash, Hasher};

#[derive(Debug)]
pub struct IdentityRole {
    value: String,
}

impl IdentityRole {
    pub fn new(id: String) -> IdentityRole {
        Self { value: id }
    }

    pub fn value(&self) -> String {
        self.value.clone()
    }
}

impl PartialEq for IdentityRole {
    fn eq(&self, other: &Self) -> bool {
        self.value() == other.value()
    }
}

impl Hash for IdentityRole {
    fn hash<H: Hasher>(&self, state: &mut H) {
        self.value.hash(state);
    }
}

impl Eq for IdentityRole {}

impl Clone for IdentityRole {
    fn clone(&self) -> Self {
        Self::new(self.value.clone())
    }
}
