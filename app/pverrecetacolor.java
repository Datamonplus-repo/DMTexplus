package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pverrecetacolor", "/app.pverrecetacolor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pverrecetacolor extends GXWebObjectStub
{
   public pverrecetacolor( )
   {
   }

   public pverrecetacolor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pverrecetacolor.class ));
   }

   public pverrecetacolor( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pverrecetacolor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pverrecetacolor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Receta Color";
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

