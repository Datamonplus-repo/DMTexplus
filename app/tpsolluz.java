package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpsolluz", "/app.tpsolluz"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpsolluz extends GXWebObjectStub
{
   public tpsolluz( )
   {
   }

   public tpsolluz( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpsolluz.class ));
   }

   public tpsolluz( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpsolluz_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpsolluz_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Llamada con parametro";
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

