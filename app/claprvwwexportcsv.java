package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.claprvwwexportcsv", "/app.claprvwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class claprvwwexportcsv extends GXWebObjectStub
{
   public claprvwwexportcsv( )
   {
   }

   public claprvwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( claprvwwexportcsv.class ));
   }

   public claprvwwexportcsv( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new claprvwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new claprvwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLAPRVWWExport CSV";
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

