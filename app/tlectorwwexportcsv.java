package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlectorwwexportcsv", "/app.tlectorwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlectorwwexportcsv extends GXWebObjectStub
{
   public tlectorwwexportcsv( )
   {
   }

   public tlectorwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlectorwwexportcsv.class ));
   }

   public tlectorwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlectorwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlectorwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TLECTORWWExport CSV";
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

