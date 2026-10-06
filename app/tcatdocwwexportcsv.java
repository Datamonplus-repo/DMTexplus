package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatdocwwexportcsv", "/app.tcatdocwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatdocwwexportcsv extends GXWebObjectStub
{
   public tcatdocwwexportcsv( )
   {
   }

   public tcatdocwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatdocwwexportcsv.class ));
   }

   public tcatdocwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatdocwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatdocwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCATDOCWWExport CSV";
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

