package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tserpa2ww", "/app.tserpa2ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tserpa2ww extends GXWebObjectStub
{
   public tserpa2ww( )
   {
   }

   public tserpa2ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tserpa2ww.class ));
   }

   public tserpa2ww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tserpa2ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tserpa2ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Entrada de Parámetros Fase";
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

