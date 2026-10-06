package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcdencproductos_anyadidasexportcsv", "/app.wcwcdencproductos_anyadidasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcdencproductos_anyadidasexportcsv extends GXWebObjectStub
{
   public wcwcdencproductos_anyadidasexportcsv( )
   {
   }

   public wcwcdencproductos_anyadidasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcdencproductos_anyadidasexportcsv.class ));
   }

   public wcwcdencproductos_anyadidasexportcsv( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcdencproductos_anyadidasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcdencproductos_anyadidasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWcdencproductos_Anyadidas Export CSV";
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

