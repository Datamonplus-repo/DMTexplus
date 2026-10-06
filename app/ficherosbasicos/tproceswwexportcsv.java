package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tproceswwexportcsv", "/app.ficherosbasicos.tproceswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproceswwexportcsv extends GXWebObjectStub
{
   public tproceswwexportcsv( )
   {
   }

   public tproceswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproceswwexportcsv.class ));
   }

   public tproceswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproceswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproceswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPROCESWWExport CSV";
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

