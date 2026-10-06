package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipprowwexportcsv", "/app.stocksquimicos.ttipprowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipprowwexportcsv extends GXWebObjectStub
{
   public ttipprowwexportcsv( )
   {
   }

   public ttipprowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipprowwexportcsv.class ));
   }

   public ttipprowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipprowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipprowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPPROWWExport CSV";
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

