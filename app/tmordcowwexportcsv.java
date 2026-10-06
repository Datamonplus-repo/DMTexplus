package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordcowwexportcsv", "/app.tmordcowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordcowwexportcsv extends GXWebObjectStub
{
   public tmordcowwexportcsv( )
   {
   }

   public tmordcowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordcowwexportcsv.class ));
   }

   public tmordcowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordcowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordcowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMOrd Co WWExport CSV";
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

