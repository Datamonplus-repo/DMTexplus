package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn22ww", "/app.ttrn22ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn22ww extends GXWebObjectStub
{
   public ttrn22ww( )
   {
   }

   public ttrn22ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn22ww.class ));
   }

   public ttrn22ww( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn22ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn22ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Entrada Tejido Crudo Almacen";
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

