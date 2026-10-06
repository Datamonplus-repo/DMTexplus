package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tclimatww", "/app.formulaciontinte.tclimatww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclimatww extends GXWebObjectStub
{
   public tclimatww( )
   {
   }

   public tclimatww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclimatww.class ));
   }

   public tclimatww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclimatww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclimatww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Numeracion Color en funcion Cliente y Matiz";
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

