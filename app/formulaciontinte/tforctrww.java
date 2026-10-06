package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tforctrww", "/app.formulaciontinte.tforctrww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforctrww extends GXWebObjectStub
{
   public tforctrww( )
   {
   }

   public tforctrww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforctrww.class ));
   }

   public tforctrww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforctrww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforctrww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tipo de Control";
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

