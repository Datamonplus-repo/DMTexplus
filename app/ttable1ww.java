package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttable1ww", "/app.ttable1ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttable1ww extends GXWebObjectStub
{
   public ttable1ww( )
   {
   }

   public ttable1ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttable1ww.class ));
   }

   public ttable1ww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttable1ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttable1ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " CUADERNO DE ENCARGOS (MARCAS)";
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

