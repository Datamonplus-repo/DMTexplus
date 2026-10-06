package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tturnoswwexportcsv", "/app.tturnoswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tturnoswwexportcsv extends GXWebObjectStub
{
   public tturnoswwexportcsv( )
   {
   }

   public tturnoswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tturnoswwexportcsv.class ));
   }

   public tturnoswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tturnoswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tturnoswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTURNOSWWExport CSV";
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

