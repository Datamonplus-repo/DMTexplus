package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tubiin", "/app.tubiin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tubiin extends GXWebObjectStub
{
   public tubiin( )
   {
   }

   public tubiin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tubiin.class ));
   }

   public tubiin( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tubiin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tubiin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTRADA INFORMACION UBICACION";
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

