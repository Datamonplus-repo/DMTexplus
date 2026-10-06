package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tclimatwwexportcsv", "/app.formulaciontinte.tclimatwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclimatwwexportcsv extends GXWebObjectStub
{
   public tclimatwwexportcsv( )
   {
   }

   public tclimatwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclimatwwexportcsv.class ));
   }

   public tclimatwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclimatwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclimatwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLIMATWWExport CSV";
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

