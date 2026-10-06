package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpalmacentejidowwexportcsv", "/app.nwdpalmacentejidowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpalmacentejidowwexportcsv extends GXWebObjectStub
{
   public nwdpalmacentejidowwexportcsv( )
   {
   }

   public nwdpalmacentejidowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpalmacentejidowwexportcsv.class ));
   }

   public nwdpalmacentejidowwexportcsv( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpalmacentejidowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpalmacentejidowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPAlmacen Tejido WWExport CSV";
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

