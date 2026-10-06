package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordmrwwexportcsv", "/app.tmordmrwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordmrwwexportcsv extends GXWebObjectStub
{
   public tmordmrwwexportcsv( )
   {
   }

   public tmordmrwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordmrwwexportcsv.class ));
   }

   public tmordmrwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordmrwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordmrwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMOrd MRWWExport CSV";
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

