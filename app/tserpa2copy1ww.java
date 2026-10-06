package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tserpa2copy1ww", "/app.tserpa2copy1ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tserpa2copy1ww extends GXWebObjectStub
{
   public tserpa2copy1ww( )
   {
   }

   public tserpa2copy1ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tserpa2copy1ww.class ));
   }

   public tserpa2copy1ww( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tserpa2copy1ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tserpa2copy1ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Parametros Fases";
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

