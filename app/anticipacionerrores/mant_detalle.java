package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.mant_detalle", "/app.anticipacionerrores.mant_detalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mant_detalle extends GXWebObjectStub
{
   public mant_detalle( )
   {
   }

   public mant_detalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mant_detalle.class ));
   }

   public mant_detalle( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mant_detalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mant_detalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " MADet";
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

