package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tprdfor", "/app.formulaciontinte.tprdfor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdfor extends GXWebObjectStub
{
   public tprdfor( )
   {
   }

   public tprdfor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdfor.class ));
   }

   public tprdfor( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdfor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdfor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos (#)";
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

