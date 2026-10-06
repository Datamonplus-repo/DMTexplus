package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tminvstwwexportcsv", "/app.tminvstwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tminvstwwexportcsv extends GXWebObjectStub
{
   public tminvstwwexportcsv( )
   {
   }

   public tminvstwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tminvstwwexportcsv.class ));
   }

   public tminvstwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tminvstwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tminvstwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMInv St WWExport CSV";
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

