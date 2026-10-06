package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttapar", "/app.ttapar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttapar extends GXWebObjectStub
{
   public ttapar( )
   {
   }

   public ttapar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttapar.class ));
   }

   public ttapar( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttapar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttapar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST DE APARIENCIA";
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

