package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tmarcaswwexportcsv", "/app.ficherosbasicos.tmarcaswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmarcaswwexportcsv extends GXWebObjectStub
{
   public tmarcaswwexportcsv( )
   {
   }

   public tmarcaswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmarcaswwexportcsv.class ));
   }

   public tmarcaswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmarcaswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmarcaswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMARCASWWExport CSV";
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

