package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.ttipcolww", "/app.formulaciontinte.ttipcolww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcolww extends GXWebObjectStub
{
   public ttipcolww( )
   {
   }

   public ttipcolww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcolww.class ));
   }

   public ttipcolww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcolww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcolww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tipo de Colorante";
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

