package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedobswwexportcsv", "/app.tpedobswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedobswwexportcsv extends GXWebObjectStub
{
   public tpedobswwexportcsv( )
   {
   }

   public tpedobswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedobswwexportcsv.class ));
   }

   public tpedobswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedobswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedobswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPEDOBSWWExport CSV";
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

