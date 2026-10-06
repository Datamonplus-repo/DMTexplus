package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tfrasrwwexportcsv", "/app.stocksquimicos.tfrasrwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfrasrwwexportcsv extends GXWebObjectStub
{
   public tfrasrwwexportcsv( )
   {
   }

   public tfrasrwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfrasrwwexportcsv.class ));
   }

   public tfrasrwwexportcsv( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfrasrwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfrasrwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFRASRWWExport CSV";
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

