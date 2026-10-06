package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipartwwexportcsv", "/app.ttipartwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipartwwexportcsv extends GXWebObjectStub
{
   public ttipartwwexportcsv( )
   {
   }

   public ttipartwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipartwwexportcsv.class ));
   }

   public ttipartwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipartwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipartwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPARTWWExport CSV";
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

