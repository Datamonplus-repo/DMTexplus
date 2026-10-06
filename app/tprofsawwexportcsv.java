package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprofsawwexportcsv", "/app.tprofsawwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprofsawwexportcsv extends GXWebObjectStub
{
   public tprofsawwexportcsv( )
   {
   }

   public tprofsawwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprofsawwexportcsv.class ));
   }

   public tprofsawwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprofsawwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprofsawwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPROFSAWWExport CSV";
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

