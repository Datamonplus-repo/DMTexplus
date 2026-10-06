package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tfacdivwwexportcsv", "/app.facturacion.tfacdivwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfacdivwwexportcsv extends GXWebObjectStub
{
   public tfacdivwwexportcsv( )
   {
   }

   public tfacdivwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfacdivwwexportcsv.class ));
   }

   public tfacdivwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfacdivwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfacdivwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFACDIVWWExport CSV";
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

