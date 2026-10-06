package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttuboswwexportcsv", "/app.ficherosbasicos.ttuboswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttuboswwexportcsv extends GXWebObjectStub
{
   public ttuboswwexportcsv( )
   {
   }

   public ttuboswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttuboswwexportcsv.class ));
   }

   public ttuboswwexportcsv( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttuboswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttuboswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTUBOSWWExport CSV";
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

