package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tgrdtipwwexportcsv", "/app.ficherosbasicos.tgrdtipwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgrdtipwwexportcsv extends GXWebObjectStub
{
   public tgrdtipwwexportcsv( )
   {
   }

   public tgrdtipwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgrdtipwwexportcsv.class ));
   }

   public tgrdtipwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgrdtipwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgrdtipwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TGRDTIPWWExport CSV";
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

