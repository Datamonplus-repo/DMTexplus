package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdoctrnwwexportcsv", "/app.tdoctrnwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdoctrnwwexportcsv extends GXWebObjectStub
{
   public tdoctrnwwexportcsv( )
   {
   }

   public tdoctrnwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdoctrnwwexportcsv.class ));
   }

   public tdoctrnwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdoctrnwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdoctrnwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDOCTRNWWExport CSV";
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

