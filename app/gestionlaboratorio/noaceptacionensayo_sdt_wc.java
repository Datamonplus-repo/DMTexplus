package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.noaceptacionensayo_sdt_wc", "/app.gestionlaboratorio.noaceptacionensayo_sdt_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class noaceptacionensayo_sdt_wc extends GXWebObjectStub
{
   public noaceptacionensayo_sdt_wc( )
   {
   }

   public noaceptacionensayo_sdt_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( noaceptacionensayo_sdt_wc.class ));
   }

   public noaceptacionensayo_sdt_wc( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new noaceptacionensayo_sdt_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new noaceptacionensayo_sdt_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "No Aceptacion Ensayo (SDT)";
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

