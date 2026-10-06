package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tforctrwwexportcsv", "/app.formulaciontinte.tforctrwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforctrwwexportcsv extends GXWebObjectStub
{
   public tforctrwwexportcsv( )
   {
   }

   public tforctrwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforctrwwexportcsv.class ));
   }

   public tforctrwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforctrwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforctrwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFORCTRWWExport CSV";
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

