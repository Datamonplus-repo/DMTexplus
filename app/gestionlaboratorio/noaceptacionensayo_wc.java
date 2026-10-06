package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.noaceptacionensayo_wc", "/app.gestionlaboratorio.noaceptacionensayo_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class noaceptacionensayo_wc extends GXWebObjectStub
{
   public noaceptacionensayo_wc( )
   {
   }

   public noaceptacionensayo_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( noaceptacionensayo_wc.class ));
   }

   public noaceptacionensayo_wc( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new noaceptacionensayo_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new noaceptacionensayo_wc_impl(context).cleanup();
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

