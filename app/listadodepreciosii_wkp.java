package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listadodepreciosii_wkp", "/app.listadodepreciosii_wkp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodepreciosii_wkp extends GXWebObjectStub
{
   public listadodepreciosii_wkp( )
   {
   }

   public listadodepreciosii_wkp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodepreciosii_wkp.class ));
   }

   public listadodepreciosii_wkp( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodepreciosii_wkp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodepreciosii_wkp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listadode Precios II";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

