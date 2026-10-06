package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tfacvtowwexportcsv", "/app.facturacion.tfacvtowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfacvtowwexportcsv extends GXWebObjectStub
{
   public tfacvtowwexportcsv( )
   {
   }

   public tfacvtowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfacvtowwexportcsv.class ));
   }

   public tfacvtowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfacvtowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfacvtowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFACVTOWWExport CSV";
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

