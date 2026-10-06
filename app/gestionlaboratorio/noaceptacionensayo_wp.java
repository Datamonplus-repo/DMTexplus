package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.noaceptacionensayo_wp", "/app.gestionlaboratorio.noaceptacionensayo_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class noaceptacionensayo_wp extends GXWebObjectStub
{
   public noaceptacionensayo_wp( )
   {
   }

   public noaceptacionensayo_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( noaceptacionensayo_wp.class ));
   }

   public noaceptacionensayo_wp( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new noaceptacionensayo_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new noaceptacionensayo_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NO Aceptacion Ensayo";
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

