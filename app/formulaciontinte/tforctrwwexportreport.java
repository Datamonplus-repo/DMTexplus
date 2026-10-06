package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tforctrwwexportreport", "/app.formulaciontinte.tforctrwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforctrwwexportreport extends GXWebObjectStub
{
   public tforctrwwexportreport( )
   {
   }

   public tforctrwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforctrwwexportreport.class ));
   }

   public tforctrwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforctrwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforctrwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Formula en Control";
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

