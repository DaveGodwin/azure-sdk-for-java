/**
 * Object]
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.NetworkInterface;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in NetworkInterfacesOperations.
 */
public interface NetworkInterfacesOperations {
    /**
     * The delete netwokInterface operation deletes the specified netwokInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String networkInterfaceName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete netwokInterface operation deletes the specified netwokInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String networkInterfaceName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The delete netwokInterface operation deletes the specified netwokInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String networkInterfaceName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The delete netwokInterface operation deletes the specified netwokInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String networkInterfaceName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get ntework interface operation retreives information about the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkInterface object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<NetworkInterface> get(String resourceGroupName, String networkInterfaceName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get ntework interface operation retreives information about the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String networkInterfaceName, String expand, final ServiceCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put NetworkInterface operation creates/updates a networkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param parameters Parameters supplied to the create/update NetworkInterface operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the NetworkInterface object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<NetworkInterface> createOrUpdate(String resourceGroupName, String networkInterfaceName, NetworkInterface parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put NetworkInterface operation creates/updates a networkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param parameters Parameters supplied to the create/update NetworkInterface operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String networkInterfaceName, NetworkInterface parameters, final ServiceCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put NetworkInterface operation creates/updates a networkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param parameters Parameters supplied to the create/update NetworkInterface operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkInterface object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<NetworkInterface> beginCreateOrUpdate(String resourceGroupName, String networkInterfaceName, NetworkInterface parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put NetworkInterface operation creates/updates a networkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param parameters Parameters supplied to the create/update NetworkInterface operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String networkInterfaceName, NetworkInterface parameters, final ServiceCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine from a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkInterface&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<NetworkInterface>> listVirtualMachineScaleSetVMNetworkInterfaces(final String resourceGroupName, final String virtualMachineScaleSetName, final String virtualmachineIndex) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine from a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listVirtualMachineScaleSetVMNetworkInterfacesAsync(final String resourceGroupName, final String virtualMachineScaleSetName, final String virtualmachineIndex, final ListOperationCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkInterface&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<NetworkInterface>> listVirtualMachineScaleSetNetworkInterfaces(final String resourceGroupName, final String virtualMachineScaleSetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listVirtualMachineScaleSetNetworkInterfacesAsync(final String resourceGroupName, final String virtualMachineScaleSetName, final ListOperationCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get ntework interface operation retreives information about the specified network interface in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkInterface object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<NetworkInterface> getVirtualMachineScaleSetNetworkInterface(String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, String networkInterfaceName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get ntework interface operation retreives information about the specified network interface in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getVirtualMachineScaleSetNetworkInterfaceAsync(String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, String networkInterfaceName, String expand, final ServiceCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkInterface&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<NetworkInterface>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllAsync(final ListOperationCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkInterface&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<NetworkInterface>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final ListOperationCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine from a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkInterface&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> listVirtualMachineScaleSetVMNetworkInterfacesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine from a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listVirtualMachineScaleSetVMNetworkInterfacesNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkInterface&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> listVirtualMachineScaleSetNetworkInterfacesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list network interface operation retrieves information about all network interfaces in a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listVirtualMachineScaleSetNetworkInterfacesNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkInterface&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkInterface&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<NetworkInterface>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List networkInterfaces opertion retrieves all the networkInterfaces in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<NetworkInterface> serviceCallback) throws IllegalArgumentException;

}
