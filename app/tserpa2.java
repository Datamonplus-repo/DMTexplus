package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tserpa2", "/app.tserpa2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tserpa2 extends GXWebObjectStub
{
   public tserpa2( )
   {
   }

   public tserpa2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tserpa2.class ));
   }

   public tserpa2( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tserpa2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tserpa2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada de Parámetros Fase";
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

