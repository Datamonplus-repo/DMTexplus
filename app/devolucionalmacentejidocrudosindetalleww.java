package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.devolucionalmacentejidocrudosindetalleww", "/app.devolucionalmacentejidocrudosindetalleww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devolucionalmacentejidocrudosindetalleww extends GXWebObjectStub
{
   public devolucionalmacentejidocrudosindetalleww( )
   {
   }

   public devolucionalmacentejidocrudosindetalleww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devolucionalmacentejidocrudosindetalleww.class ));
   }

   public devolucionalmacentejidocrudosindetalleww( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devolucionalmacentejidocrudosindetalleww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devolucionalmacentejidocrudosindetalleww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Devolucion Almacen Tejido Crudo (sin detalle)";
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

