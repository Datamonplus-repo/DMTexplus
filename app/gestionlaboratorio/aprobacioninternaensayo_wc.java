package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.aprobacioninternaensayo_wc", "/app.gestionlaboratorio.aprobacioninternaensayo_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aprobacioninternaensayo_wc extends GXWebObjectStub
{
   public aprobacioninternaensayo_wc( )
   {
   }

   public aprobacioninternaensayo_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aprobacioninternaensayo_wc.class ));
   }

   public aprobacioninternaensayo_wc( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aprobacioninternaensayo_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aprobacioninternaensayo_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Aprobacion Interna Ensayo";
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

