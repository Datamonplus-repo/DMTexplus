package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmetpie", "/app.tmetpie"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmetpie extends GXWebObjectStub
{
   public tmetpie( )
   {
   }

   public tmetpie( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmetpie.class ));
   }

   public tmetpie( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmetpie_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmetpie_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "METRAJE DE PIEZAS";
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

