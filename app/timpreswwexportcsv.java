package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.timpreswwexportcsv", "/app.timpreswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class timpreswwexportcsv extends GXWebObjectStub
{
   public timpreswwexportcsv( )
   {
   }

   public timpreswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( timpreswwexportcsv.class ));
   }

   public timpreswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new timpreswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new timpreswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIMPRESWWExport CSV";
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

