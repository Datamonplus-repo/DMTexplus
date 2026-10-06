package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.talcobswwexportcsv", "/app.albaranescomerciales.talcobswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talcobswwexportcsv extends GXWebObjectStub
{
   public talcobswwexportcsv( )
   {
   }

   public talcobswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talcobswwexportcsv.class ));
   }

   public talcobswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talcobswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talcobswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALCOBSWWExport CSV";
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

