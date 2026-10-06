package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnprovprdproveedoresprompt", "/app.tnprovprdproveedoresprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnprovprdproveedoresprompt extends GXWebObjectStub
{
   public tnprovprdproveedoresprompt( )
   {
   }

   public tnprovprdproveedoresprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnprovprdproveedoresprompt.class ));
   }

   public tnprovprdproveedoresprompt( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnprovprdproveedoresprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnprovprdproveedoresprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Proveedores";
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

