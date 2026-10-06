package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tfacdivwwexportreport", "/app.facturacion.tfacdivwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfacdivwwexportreport extends GXWebObjectStub
{
   public tfacdivwwexportreport( )
   {
   }

   public tfacdivwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfacdivwwexportreport.class ));
   }

   public tfacdivwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfacdivwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfacdivwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFACDIVWWExport Report";
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

