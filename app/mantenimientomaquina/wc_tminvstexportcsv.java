package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.wc_tminvstexportcsv", "/app.mantenimientomaquina.wc_tminvstexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_tminvstexportcsv extends GXWebObjectStub
{
   public wc_tminvstexportcsv( )
   {
   }

   public wc_tminvstexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_tminvstexportcsv.class ));
   }

   public wc_tminvstexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_tminvstexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_tminvstexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WC_TMInv St Export CSV";
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

