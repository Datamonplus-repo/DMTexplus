package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn25", "/app.ttrn25"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn25 extends GXWebObjectStub
{
   public ttrn25( )
   {
   }

   public ttrn25( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn25.class ));
   }

   public ttrn25( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn25_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn25_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pruebas tabla DEFECTOS";
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

