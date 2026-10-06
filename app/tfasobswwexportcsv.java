package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasobswwexportcsv", "/app.tfasobswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasobswwexportcsv extends GXWebObjectStub
{
   public tfasobswwexportcsv( )
   {
   }

   public tfasobswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasobswwexportcsv.class ));
   }

   public tfasobswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasobswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasobswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFASOBSWWExport CSV";
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

