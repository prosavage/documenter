package net.savagelabs.dockerdocumenter.docs

import org.bukkit.permissions.PermissionDefault

data class DocPermission(val permissionNode: String, val description: String, val permissionDefault: PermissionDefault)